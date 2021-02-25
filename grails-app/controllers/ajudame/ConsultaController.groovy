package ajudame

class ConsultaController {

    def index() {
        def lista = []

        lista = Cliente.list()


        render(view:"index", model: [lista: lista.nome])

    }
}
