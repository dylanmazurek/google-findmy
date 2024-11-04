package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjv extends fxc implements fhr, fhs {
    private static final fma h = fxa.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final fkp d;
    public fxe e;
    public fjd f;
    public final fma g;

    public fjv(Context context, Handler handler, fkp fkpVar) {
        fma fmaVar = h;
        this.a = context;
        this.b = handler;
        this.d = fkpVar;
        this.c = fkpVar.b;
        this.g = fmaVar;
    }

    @Override // defpackage.fiv
    public final void a(int i) {
        fjd fjdVar = this.f;
        fjb fjbVar = (fjb) fjdVar.e.k.get(fjdVar.b);
        if (fjbVar != null) {
            if (fjbVar.g) {
                fjbVar.l(new ConnectionResult(17));
            } else {
                fjbVar.a(i);
            }
        }
    }

    @Override // defpackage.fiv
    public final void b() {
        GoogleSignInAccount googleSignInAccount;
        Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        fxe fxeVar = this.e;
        try {
            Account account = fxeVar.t.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = fxeVar.b;
                fet.a.lock();
                try {
                    if (fet.b == null) {
                        fet.b = new fet(context.getApplicationContext());
                    }
                    fet fetVar = fet.b;
                    fet.a.unlock();
                    String a = fetVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a)) {
                        String a2 = fetVar.a("googleSignInAccount:" + a);
                        if (a2 != null) {
                            if (!TextUtils.isEmpty(a2)) {
                                JSONObject jSONObject = new JSONObject(a2);
                                String optString = jSONObject.optString("photoUrl");
                                if (!TextUtils.isEmpty(optString)) {
                                    uri = Uri.parse(optString);
                                } else {
                                    uri = null;
                                }
                                long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                                HashSet hashSet = new HashSet();
                                JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    hashSet.add(new Scope(jSONArray.getString(i)));
                                }
                                String optString2 = jSONObject.optString("id");
                                if (jSONObject.has("tokenId")) {
                                    str = jSONObject.optString("tokenId");
                                } else {
                                    str = null;
                                }
                                if (jSONObject.has("email")) {
                                    str2 = jSONObject.optString("email");
                                } else {
                                    str2 = null;
                                }
                                if (jSONObject.has("displayName")) {
                                    str3 = jSONObject.optString("displayName");
                                } else {
                                    str3 = null;
                                }
                                if (jSONObject.has("givenName")) {
                                    str4 = jSONObject.optString("givenName");
                                } else {
                                    str4 = null;
                                }
                                if (jSONObject.has("familyName")) {
                                    str5 = jSONObject.optString("familyName");
                                } else {
                                    str5 = null;
                                }
                                Long valueOf = Long.valueOf(parseLong);
                                String string = jSONObject.getString("obfuscatedIdentifier");
                                valueOf.getClass();
                                fma.aP(string);
                                googleSignInAccount = new GoogleSignInAccount(optString2, str, str2, str3, uri, null, parseLong, string, new ArrayList(hashSet), str4, str5);
                                if (jSONObject.has("serverAuthCode")) {
                                    str6 = jSONObject.optString("serverAuthCode");
                                } else {
                                    str6 = null;
                                }
                                googleSignInAccount.f = str6;
                                Integer num = fxeVar.u;
                                fma.aR(num);
                                ResolveAccountRequest resolveAccountRequest = new ResolveAccountRequest(2, account, num.intValue(), googleSignInAccount);
                                fxd fxdVar = (fxd) fxeVar.v();
                                SignInRequest signInRequest = new SignInRequest(1, resolveAccountRequest);
                                Parcel a3 = fxdVar.a();
                                duh.c(a3, signInRequest);
                                duh.d(a3, this);
                                fxdVar.c(12, a3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    fet.a.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = fxeVar.u;
            fma.aR(num2);
            ResolveAccountRequest resolveAccountRequest2 = new ResolveAccountRequest(2, account, num2.intValue(), googleSignInAccount);
            fxd fxdVar2 = (fxd) fxeVar.v();
            SignInRequest signInRequest2 = new SignInRequest(1, resolveAccountRequest2);
            Parcel a32 = fxdVar2.a();
            duh.c(a32, signInRequest2);
            duh.d(a32, this);
            fxdVar2.c(12, a32);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new SignInResponse(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.fxc
    public final void c(SignInResponse signInResponse) {
        this.b.post(new fbh(this, signInResponse, 9, (char[]) null));
    }

    @Override // defpackage.fjr
    public final void i(ConnectionResult connectionResult) {
        this.f.b(connectionResult);
    }
}
