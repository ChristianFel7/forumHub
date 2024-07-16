package forumHub.api.controller;

import forumHub.api.topico.DadosCadastroTopico;
import forumHub.api.topico.Topico;
import forumHub.api.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroTopico dados){
        System.out.println(dados);
        repository.save(new Topico(dados));
    }

    @GetMapping
    public void listar(){
        System.out.println("Funcionando!!!");
    }



}
