import SwiftUI

struct LoginView: View {
    @State private var emailAddress: String = ""
    @State private var password: String = ""
    
    var body: some View {
        ScrollView {
            VStack(alignment: .center, spacing: 16) {
                Text("Sign In")
                    .font(.system(size: 32, weight: .regular))
                    .frame(maxWidth: .infinity, alignment: .center)
                    .padding(.top, 32)
                
                TextField("Email Address", text: $emailAddress)
                    .padding()
                    .background(Color(.systemGray6))
                    .cornerRadius(4)
                    .padding(.top, 12)
                    .frame(maxWidth: .infinity)
                
                SecureField("Password", text: $password)
                    .padding()
                    .background(Color(.systemGray6))
                    .cornerRadius(4)
                    .padding(.top, 12)
                    .frame(maxWidth: .infinity)
                
                CustomButton(text: "Sign In", action: {
                    // Sign In action
                })
                
                Text("Forgot Password? Reset")
                    .frame(maxWidth: .infinity, alignment: .leading)
                    .padding(.leading, 16)
                
                CustomButton(text: "Log In as Guest", action: {
                    // Log In as Guest action
                })
                
                CustomButton(text: "Register", action: {
                    // Register action
                })
                
                Spacer().frame(height: 48)
                
                ContinueWithCustomButton(text: "Continue With Apple", imageName: "AppleLogo", action: {
                    // Continue with Apple action
                })
                
                ContinueWithCustomButton(text: "Continue With Google", imageName: "GoogleIcon", action: {
                    // Continue with Google action
                })
                
                ContinueWithCustomButton(text: "Continue With Facebook", imageName: "FacebookIcon", action: {
                    // Continue with Facebook action
                })
                
                Spacer()
            }
            .padding(16)
        }
        .background(Color.white)
        .edgesIgnoringSafeArea(.all)
    }
}

struct CustomButton: View {
    var text: String
    var action: () -> Void
    
    var body: some View {
        Button(action: action) {
            Text(text)
                .foregroundColor(.white)
                .frame(maxWidth: .infinity, minHeight: 50)
                .background(Color("PrimaryColor"))
                .cornerRadius(25)
        }
    }
}

struct ContinueWithCustomButton: View {
    var text: String
    var imageName: String
    var action: () -> Void
    
    var body: some View {
        HStack {
            Image(imageName)
                .resizable()
                .frame(width: 32, height: 32)
                .padding(.leading, 16)
            
            Text(text)
                .frame(maxWidth: .infinity, alignment: .center)
                .padding(.trailing, 32)
        }
        .frame(maxWidth: .infinity, minHeight: 50)
        .background(Color(.systemGray6))
        .cornerRadius(25)
        .onTapGesture {
            action()
        }
    }
}

struct LoginView_Previews: PreviewProvider {
    static var previews: some View {
        LoginView()
    }
}







