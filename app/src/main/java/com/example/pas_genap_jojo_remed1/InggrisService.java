package com.example.pas_genap_jojo_remed1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InggrisService {

    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getTeams();
}
