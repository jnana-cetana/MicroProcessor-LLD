package microprocessor.lld.instructions;

import microprocessor.lld.MicroProcessor;
import microprocessor.lld.Register;

public class SetInstruction implements Instruction {
    private final MicroProcessor microProcessor;
    private final Register register;
    private final int value;

    public SetInstruction(String register, int value, MicroProcessor microProcessor) {
        this.microProcessor = microProcessor;
        this.register = this.microProcessor.getRegister(register);
        this.value = value;
    }

    @Override
    public void execute() {
        this.register.setValue(value);
    }
}
