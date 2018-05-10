package com.codetroopers.eput.domain.entities;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
public class GoldenBookEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    private int note;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> tags;

    /**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public GoldenBookEntry() {
        this.createdAt = new Date();
        note=-1;
        tags= new ArrayList<String>();
        for(int i=0;i<3;i++)
        {
        	 tags.add("");
        }
       
    }

    public GoldenBookEntry(final String author, final String content) {
       this(author, content, new Date(),-1,new ArrayList<String>());  
    }

    public GoldenBookEntry(final String author, final String content, final Date createdAt,int note,List<String> tags) {
        this.author = author;
        this.content = content;
        this.createdAt = createdAt;
        this.note=note;
        this.tags=tags;
        
    }
    

    /************************** GETTER / SETTERS ****************************/
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

	/**
	 * @return the note
	 */
	public int getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(int note) {
		this.note = note;
	}
}
