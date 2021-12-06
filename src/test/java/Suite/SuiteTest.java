package Suite;

import Page.CriarContaNaPaginaComPage;
import Page.CriarMovimentacaoNaPaginaComPage;
import Page.ExcluirResumoMensalPage;
import Page.RealizarLoginPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@org.junit.runners.Suite.SuiteClasses({
        RealizarLoginPage.class,
        CriarContaNaPaginaComPage.class,
        CriarMovimentacaoNaPaginaComPage.class,
        ExcluirResumoMensalPage.class


})
public class SuiteTest {

//teste

}
