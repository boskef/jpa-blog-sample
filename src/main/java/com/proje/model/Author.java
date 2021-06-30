package com.proje.model;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Author.findAuthors", query = "SELECT a FROM Author a"),
        @NamedQuery(name = "Author.findAuthorsCount", query = "SELECT COUNT(a) FROM Author a")
})
@Table(name = "SS_AUTHOR")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    @Column(name = "author_name")
    private String authorName;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "tcNo", column = @Column(name = "tc_kimlik_no", length = 11)),
            @AttributeOverride(name = "adress", column = @Column(name = "adres_info")),
            @AttributeOverride(name= "phoneNumber", column = @Column(name = "phone_number"))
    })
    private Contact contact;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Post> postList;

    public Author(){ }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
