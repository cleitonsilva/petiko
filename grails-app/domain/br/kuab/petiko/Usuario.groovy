package br.kuab.petiko

class Usuario {

	transient springSecurityService

	String  username
	String  password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
        long    uid
        String  accessToken
        Date    accessTokenExpires
        
	static constraints = {
		username (blank: false, unique: true)
		password (blank: false)
                accessToken (nullable: true)
                accessTokenExpires (nullable: true)
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Papel> getAuthorities() {
		UsuarioPapel.findAllByUsuario(this).collect { it.papel } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
