package com.tts.ecommercepage.Models;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @ElementCollection
    Map<Product, Integer> cart = new HashMap<Product, Integer>();

    
    
    @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
  // TODO Auto-generated method stub
  return null;
  }
  @Override
  public boolean isAccountNonExpired() {
  // TODO Auto-generated method stub
  return true;
  }
  @Override
  public boolean isAccountNonLocked() {
  // TODO Auto-generated method stub
  return true;
  }
  @Override
  public boolean isCredentialsNonExpired() {
  // TODO Auto-generated method stub
  return true;
  }
  @Override
  public boolean isEnabled() {
  // TODO Auto-generated method stub
  return true;
  }



  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getUsername() {
      return username;
  }

  public void setUsername(String username) {
      this.username = username;
  }

  public String getPassword() {
      return password;
  }

  public void setPassword(String password) {
      this.password = password;
  }

  public String getFirst_name() {
      return first_name;
  }

  public void setFirst_name(String first_name) {
      this.first_name = first_name;
  }

  public String getLast_name() {
      return last_name;
  }

  public void setLast_name(String last_name) {
      this.last_name = last_name;
  }

  public Map<Product, Integer> getCart() {
      return cart;
  }

  public void setCart(Map<Product, Integer> cart) {
      this.cart = cart;
  }
    
}
