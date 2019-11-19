package ar.edu.unahur.obj2.ejercicio3;

public class ExtractorDeTexto {

    public String extraerTexto(Documento documento) {
        StringBuffer text = new StringBuffer();
        for (Nodo nodo : documento.nodes()) {
            if(nodo instanceof Link) {
                extractLinkTag(nodo, text);
            } else if(nodo instanceof Tag) {
                extractTag(nodo, text);
            } else if(nodo instanceof StringNodo) {
                extractStringNode(nodo, text);
            } else {
                throw new RuntimeException("Tipo de Nodo no soportado");
            }
        }
        return text.toString();
    }

    private void extractStringNode(Nodo nodo, StringBuffer text) {
        text.append(((StringNodo) nodo).texto());
    }

    private void extractTag(Nodo nodo, StringBuffer text) {
        text.append(((Tag) nodo).valor());
    }

    private void extractLinkTag(Nodo nodo, StringBuffer text) {
        text.append(((Link) nodo).etiqueta());
    }

}
