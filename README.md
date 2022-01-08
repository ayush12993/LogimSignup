# LogimSignup

        Login SignUp Documentation


Save Roles--:
Post Api - https://localhoast:8080/api/auth/saveRoles 

Sign up--:
Post Api – https://localhoast:8080/api/auth/signup 

Body/raw/Json -   {
  "username": "ayush",
  "email": "ayush2202ksr@gmail.com",
  "role": [
    "user"/"admin"/"mod"/"user,mod"
  ],
  "password": "123456"
}
Sign in--:
Post Api - https://localhoast:8080/api/auth/signin

Body/raw/Json -   {
  "username": "ayush",
  "password": "123456"
} 

Admin Page--:
Post Api - https://localhoast:8080/api/auth/panel/admin

Headers –"Authorization": "Bearer "+tokenvalue

Moderator Page--:
Post Api - https://localhoast:8080/api/auth/panel/mod

Headers –"Authorization": "Bearer "+tokenvalue

User Page--:
Post Api - https://localhoast:8080/api/auth/panel/user

Headers –"Authorization": "Bearer "+tokenvalue


