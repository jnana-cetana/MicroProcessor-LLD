package microprocessor.lld.instructions;

import microprocessor.lld.MicroProcessor;
import microprocessor.lld.Register;

public class InrInstruction implements Instruction {
    private final MicroProcessor microProcessor;
    private final Register register;

    public InrInstruction(String register, MicroProcessor microProcessor) {
        this.microProcessor = microProcessor;
        this.register = this.microProcessor.getRegister(register);
    }

    @Override
    public void execute() {
        int increment = this.register.getValue() + 1;
        this.register.setValue(increment);
    }
}