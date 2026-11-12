package chaosshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class TratadorDeErrosGlobal {

    @ExceptionHandler(RegraNegocioCaosException.class)
    public ResponseEntity<Map<String, Object>> tratarCaos(RegraNegocioCaosException e) {
        return ResponseEntity
                .status(HttpStatus.I_AM_A_TEAPOT)
                .body(montarCorpo(e.getCodigo(), e.getMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> tratarArgumentoInvalido(IllegalArgumentException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(montarCorpo("ERRO-400", e.getMessage()));
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, Object>> tratarJsonInvalido(HttpMessageNotReadableException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(montarCorpo("ERRO-400", "O JSON enviado está quebrado."));
    }

    private Map<String, Object> montarCorpo(String codigo, String mensagem) {
        Map<String, Object> corpo = new LinkedHashMap<>();
        corpo.put("codigo", codigo);
        corpo.put("mensagem", mensagem);
        corpo.put("momento", LocalDateTime.now().toString());
        return corpo;
    }
}
