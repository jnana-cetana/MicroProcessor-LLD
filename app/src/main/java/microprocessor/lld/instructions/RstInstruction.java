package microprocessor.lld.instructions;

import microprocessor.lld.MicroProcessor;

public class RstInstruction implements Instruction{
    private final MicroProcessor microProcessor;

    public RstInstruction(MicroProcessor microProcessor) {
        this.microProcessor = microProcessor;
    }

    @Override
    public void execute() {
        this.microProcessor.resetRegisters();
    }    
}
