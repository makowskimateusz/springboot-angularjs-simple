function meeting($scope, $http) {
    $http.get('meeting').
    success(function(data) {
        $scope.m = data;
    });
}

function test($scope, $http) {
    $http.get('test');
}

function meetings($scope, $http) {

    $http.get('meetings').
        success(function (data) {
            $scope.meetings = data;
    })

}
