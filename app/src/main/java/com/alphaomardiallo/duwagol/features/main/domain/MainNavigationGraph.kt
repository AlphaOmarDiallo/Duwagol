import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alphaomardiallo.duwagol.features.home.ui.HomeScreen

@Composable
fun MainNavigation(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = MainNavigationItems.Home.route){
        composable(route = MainNavigationItems.Home.route) {
            HomeScreen()
        }
        composable(route = MainNavigationItems.Calendar.route) {
            CalendarScreen()
        }
    }
}