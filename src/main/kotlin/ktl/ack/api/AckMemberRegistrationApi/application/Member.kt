package ktl.ack.api.AckMemberRegistrationApi.application

import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private val regNo: Long? = null

    @Column(name = "first_name")
    private val fname: String? = null

    @Column(name = "surname")
    private val surname: String? = null

    @Column(name = "other_names")
    private val otherNames: String? = null

    @Column(name = "gender")
    private val gender: String? = null

    @Column(name = "marital_status")
    private val maritalStatus: String? = null

    @Column(name = "children")
    private val children = 0

    @Column(name = "date_of_birth")
    private val dob: String? = null

    @Column(name = "confirmed")
    private val confirmed: String? = null

    @Column(name = "cell_group")
    private val cellGroup: String? = null

    @Column(name = "service_attended")
    private val service: String? = null

    @Column(name = "profession")
    private val profession: String? = null

    @Column(name = "occupation")
    private val occupation: String? = null

    @Column(name = "phone_no")
    private val phoneNo: String? = null

    @CreationTimestamp
    @Column(updatable = false)
    var dateCreated: Timestamp? = null

    @CreationTimestamp
    @Column(updatable = false)
    var dateNew: Timestamp? = null

}
