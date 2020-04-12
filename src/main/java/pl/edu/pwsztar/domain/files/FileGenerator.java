package pl.edu.pwsztar.domain.files;

import org.springframework.core.io.InputStreamResource;
import pl.edu.pwsztar.domain.dto.FileDto;


// TODO: Czy interfejs nie lamie zasady SOLID?
public interface FileGenerator {

    InputStreamResource toTxt(FileDto fileDto);

    InputStreamResource toCsv(FileDto fileDto);
}