package br.com.developen.erp.orm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name="\"Token\"")
@NamedQueries({
	@NamedQuery(
			name = Token.FIND_ALL, 
			query = "FROM Token T"
			),
	@NamedQuery(
			name = Token.CLEAR_EXPIRED_TOKEN_JOB,
			query = "DELETE Token WHERE expire < :now"
	)
})
public class Token implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Token.findAll";

	public static final String CLEAR_EXPIRED_TOKEN_JOB = "Token.clearExpiredTokenJob";

	@Id
	@Size(min=10, max=10)
	@Pattern(regexp = "[A-Z0-9]{10,10}")
	private String identifier;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="\"user\"", nullable=false)
	private User user;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="\"expire\"", nullable = false)
	private Date expire;

	public Token() {


	}

	public String getIdentifier() {

		return this.identifier;

	}

	public void setIdentifier(String identifier) {

		this.identifier = identifier;

	}

	public User getUser() {

		return user;

	}

	public void setUser(User user) {

		this.user = user;

	}

	public Date getExpire() {

		return expire;

	}

	public void setExpire(Date expire) {

		this.expire = expire;

	}

	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		return result;

	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Token other = (Token) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;

	}

}