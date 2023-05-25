package microprocessor.lld.instructions;

import microprocessor.lld.MicroProcessor;
import microprocessor.lld.Register;

public class AdrInstruction implements Instruction {
    private final MicroProcessor microProcessor;
    private final Register register1;
    private final Register register2;

    public AdrInstruction(String register1, String register2, MicroProcessor microProcessor) {
        this.microProcessor = microProcessor;
        this.register1 = this.microProcessor.getRegister(register1);
        this.register2 = this.microProcessor.getRegister(register2);
    }

    @Override
    public void execute() {
        int sum = this.register1.getValue() + this.register2.getValue();
        this.register1.setValue(sum);
    }
}
