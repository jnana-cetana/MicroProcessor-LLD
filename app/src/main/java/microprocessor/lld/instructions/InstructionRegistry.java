package microprocessor.lld.instructions;

import microprocessor.lld.MicroProcessor;

public class InstructionRegistry {
    private InstructionRegistry(){}

    public static Instruction getAddInstruction(String register, Integer value, MicroProcessor microprocessor){
        return new AddInstruction(register, value, microprocessor);
    }

    public static Instruction getAdrInstruction(String register1, String register2, MicroProcessor microprocessor ){
        return new AdrInstruction(register1, register2, microprocessor);
    }

    public static Instruction getDcrInstruction(String register, MicroProcessor microProcessor) {
        return new DcrInstruction(register, microProcessor);
    }

    public static Instruction getInrInstruction(String register, MicroProcessor microProcessor) {
        return new InrInstruction(register, microProcessor);
    }

    public static Instruction getMovInstruction(String register1, String register2, MicroProcessor microProcessor) {
        return new MovInstruction(register1, register2, microProcessor);
    }

    public static Instruction getRstInstruction(MicroProcessor microProcessor) {
        return new RstInstruction(microProcessor);
    }

    public static Instruction getSetInstruction(String register, Integer value, MicroProcessor microProcessor) {
        return new SetInstruction(register, value, microProcessor);
    }


}

