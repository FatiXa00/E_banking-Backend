package ma.emsi.ebankingbackend.entities;

import jakarta.persistence.*;
import lombok.Data;
import ma.emsi.ebankingbackend.enums.AccountStatus;

import java.util.Date;
import java.util.List;
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)// par defaut discriminatorType = DiscriminatorType.STRING
public class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.LAZY)
    private List<AccountOperation> accountOperations;
}