package microprocessor.lld.instructions;

public enum InstructionKeyword {
    ADR_INSTRUCTION("ADR"),
    ADD_INSTRUCTION("ADD"),
    DCR_INSTRUCTION("DCR"),
    INR_INSTRUCTION("INR"),
    MOV_INSTRUCTION("MOV"),
    RST_INSTRUCTION("RST"),
    SET_INSTRUCTION("SET");

    private final String name;
    private InstructionKeyword(String name){
        this.name = name;
    }

    public String getName() {
        return name;
     } 

}
