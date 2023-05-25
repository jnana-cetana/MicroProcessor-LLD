package microprocessor.lld.instructions;

import microprocessor.lld.MicroProcessor;
import microprocessor.lld.Register;

public class MovInstruction implements Instruction {
    private final MicroProcessor microProcessor;
    private final Register src;
    private final Register dest;

    public MovInstruction(String src, String dest, MicroProcessor microProcessor) {
        this.microProcessor = microProcessor;
        this.src = this.microProcessor.getRegister(src);
        this.dest = this.microProcessor.getRegister(dest);
    }

    @Override
    public void execute() {
        this.dest.setValue(this.src.getValue());
    }
}
