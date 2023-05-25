package microprocessor.lld.instructions;

import microprocessor.lld.MicroProcessor;
import microprocessor.lld.Register;

public class AddInstruction implements Instruction {
    private final MicroProcessor microProcessor;
    private final Register register;
    private final int value;

    public AddInstruction(String register, int value, MicroProcessor microProcessor) {
        this.microProcessor = microProcessor;
        this.register = this.microProcessor.getRegister(register);
        this.value = value;
    }

    @Override
    public void execute() {
        int sum = this.register.getValue() + this.value;
        this.register.setValue(sum);
    }
}
