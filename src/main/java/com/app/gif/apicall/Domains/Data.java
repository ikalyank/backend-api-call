package com.app.gif.apicall.Domains;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Data {
    public String type;
    public String id;
    public String url;
    public String slug;
    public String bitly_gif_url;
    public String bitly_url;
    public String embed_url;
    public String username;
    public String source;
    public String title;
    public String rating;
    public String content_url;
    public String source_tld;
    public String source_post_url;
    public int is_sticker;
    public String import_datetime;
    public String trending_datetime;
    public Images images;
    public String analytics_response_payload;
    public Analytics analytics;
}
