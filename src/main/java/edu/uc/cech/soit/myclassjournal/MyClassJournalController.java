package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return start page
     */
    @RequestMapping("/")
    public String index(Model model) {
        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setTitle("My first journal entry");
        journalEntry.setAuthor("John Doe");
        journalEntry.setDate("09/27/2023");
        journalEntry.setNotes("\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent maximus porta est ut convallis. Morbi justo elit, tincidunt vitae aliquet non, scelerisque sit amet diam. Curabitur ac congue sapien. Vestibulum et fringilla quam. Donec id urna nisi. Vivamus lobortis elit eu sapien vulputate, dapibus bibendum odio rhoncus. Nulla eu massa consequat, euismod magna vel, pellentesque tortor. Praesent justo elit, vestibulum nec est eu, aliquam consequat dui. Cras risus diam, bibendum vel orci a, vestibulum iaculis urna. Praesent tempor quis enim at varius. In commodo varius nibh in tincidunt. Fusce interdum arcu vel dolor lobortis, sed dapibus risus gravida.\n" +
                "\n" +
                "Etiam blandit vehicula ante et pellentesque. Curabitur dictum magna id arcu aliquet suscipit. Etiam ullamcorper, ante consectetur tincidunt efficitur, lacus eros maximus dolor, ut condimentum nulla purus cursus elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer facilisis quis erat a consectetur. Nulla finibus felis sed semper vehicula. Suspendisse sodales, dolor et dapibus faucibus, dolor ante pulvinar ante, at sollicitudin urna ante a velit.\n" +
                "\n" +
                "Nunc varius sollicitudin eros, sit amet lobortis turpis consequat fermentum. Donec quis convallis tellus, in congue mi. Nulla consectetur velit ut dui facilisis, quis ornare augue blandit. Maecenas maximus vestibulum nunc vitae rutrum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut vulputate, sapien vitae fringilla varius, lorem tortor aliquet nisi, at volutpat enim dui sit amet nisl. Aliquam eget ex ac nibh dictum dictum. Aliquam cursus porttitor dui, non porttitor ex suscipit nec.\n" +
                "\n" +
                "Sed id nunc vel leo pulvinar ultricies. Nam pulvinar mollis felis, id viverra ligula ullamcorper quis. Aliquam erat volutpat. Fusce mattis tortor vel odio placerat accumsan. Nunc tempor, dui ut condimentum accumsan, sem odio pharetra odio, in iaculis nisl sem vel nunc. Praesent finibus dictum quam, sit amet blandit justo interdum auctor. Nulla vel finibus nulla.");
        model.addAttribute("journalEntry", journalEntry);
        return "start";
    }
}
