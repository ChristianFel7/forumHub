package forumHub.api.topico;


public record DadosCadastroTopico(String titulo,
                                  String mensagem,
                                  String autor,
                                  Curso curso) {
}
