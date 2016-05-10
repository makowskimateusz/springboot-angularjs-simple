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

function testSendingJSON($scope, $http) {


    //simple json data created
    var dataTosend = {

        description : "testowy description z jsona",
        date : "testowa data z jsona"

    }


        $http.post('/meeting', dataTosend)
            .success(function (data) {

                $scope.message = data;

            });



}
