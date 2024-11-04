package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fxc extends dug implements IInterface {
    public fxc() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                duh.b(parcel);
                break;
            case 4:
                duh.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                duh.b(parcel);
                break;
            case 7:
                duh.b(parcel);
                break;
            case 8:
                SignInResponse signInResponse = (SignInResponse) duh.a(parcel, SignInResponse.CREATOR);
                duh.b(parcel);
                c(signInResponse);
                break;
            case 9:
                duh.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void c(SignInResponse signInResponse) {
    }
}
