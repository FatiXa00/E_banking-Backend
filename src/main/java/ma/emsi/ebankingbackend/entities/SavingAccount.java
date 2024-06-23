package ma.emsi.ebankingbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@DiscriminatorValue("SA")
public class SavingAccount extends BankAccount{
    private double interestRate;
}
