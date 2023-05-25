package microprocessor.lld;

import java.util.HashMap;
import java.util.Map;

import microprocessor.lld.instructions.Instruction;

public class MicroProcessor {
    private Map<String, Register> registers;

    public MicroProcessor() {
        this.registers = new HashMap<>();
    }

    public Register getRegister(String name) {
        return this.registers.get(name);
    }

    public void executeInstruction(Instruction instruction) {
        instruction.execute();
    }

    public void resetRegisters() {
        for (Register register : registers.values()) {
            register.setValue(0);
        }
    }

    public void addRegister(String name) {
        this.registers.put(name, new Register());
    }
    
    public void removeRegister(String name) {
        this.registers.remove(name);
    }
}
