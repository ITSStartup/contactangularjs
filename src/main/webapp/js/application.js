$app=angular.module('app',['ngResource']);

var listContactsController = function($scope,$resource) {
	
	var ContactService = $resource('rest/contacts/:id', {id: '@id'});
	
	$scope.contacts = ContactService.query();

	$scope.contact = new ContactService();

	$scope.edit = function(contact) {
		$scope.contact = contact;
	};
	
	$scope.newOne = function() {
		$scope.contact = new ContactService();
	};

	$scope.add = function() {
		$scope.contact.$save(function() {
			$scope.contacts = ContactService.query();
		});
	};
	
	$scope.remove = function(contact) {
		$scope.contact.$delete({id: contact.id}, function(res) {
			$scope.contacts = ContactService.query();
			$scope.contact = new ContactService();
		});
	};

};