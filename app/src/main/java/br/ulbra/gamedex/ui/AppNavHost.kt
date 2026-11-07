package br.ulbra.gamedex.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import br.ulbra.gamedex.data.JogoRepository

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Lista
    ) {
        composable<Lista> {
            CatalogoScreen(
                jogos = JogoRepository.listar(),
                onJogoClick = { id ->
                    navController.navigate(Detalhe(jogoId = id))
                }
            )
        }

        composable<Detalhe> { backStackEntry ->
            val rota = backStackEntry.toRoute<Detalhe>()
            DetalheScreen(
                jogoId = rota.jogoId,
                onVoltar = { navController.popBackStack() }
            )
        }
    }
}