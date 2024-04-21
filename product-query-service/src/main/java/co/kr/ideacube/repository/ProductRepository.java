package co.kr.ideacube.repository;

import co.kr.ideacube.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
