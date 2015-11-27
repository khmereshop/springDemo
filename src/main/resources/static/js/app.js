var app = angular.module('app', ['ui.router','ngCookies','ngSanitize','ngResource']);

app .config(['$stateProvider', '$urlRouterProvider',function($stateProvider, $urlRouterProvider) {

       $urlRouterProvider.otherwise("/home");
   
        $stateProvider.state('home', {
           url:'/home',
           views: {
               viewA: {
                   templateUrl: 'views/home.html',
                   controller: 'homeCtrl'
               }
           }
       })
                 
                 
}]);