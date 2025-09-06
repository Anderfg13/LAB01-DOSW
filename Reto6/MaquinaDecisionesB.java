public class MaquinaDecisionesB {

    public void ejecutarComando(String comando) {
        switch (comando) {
            case "BROMEAR":
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("La máquina susurra: Shhh... los bugs están dormidos.");
                break;
            case "ANALIZAR":
                System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!");
                break;
            default:
                System.out.println("Comando no reconocido: " + comando);
        }
    }

    public static void main(String[] args) {
        MaquinaDecisionesB maquina = new MaquinaDecisionesB();

        maquina.ejecutarComando("BROMEAR");
        maquina.ejecutarComando("GRITAR");
        maquina.ejecutarComando("SUSURRAR");
        maquina.ejecutarComando("ANALIZAR");
    }
}