package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.widget.AbsListView;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jy {
    public static void a(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }

    public static boolean b(AbsListView absListView) {
        boolean isSelectedChildViewEnabled;
        isSelectedChildViewEnabled = absListView.isSelectedChildViewEnabled();
        return isSelectedChildViewEnabled;
    }

    public static BiometricPrompt.CryptoObject c(qu quVar) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (quVar != null) {
            Cipher cipher = quVar.b;
            if (cipher == null) {
                Signature signature = quVar.a;
                if (signature == null) {
                    Mac mac = quVar.c;
                    if (mac != null) {
                        return ra.n(mac);
                    }
                    if (Build.VERSION.SDK_INT >= 30 && (identityCredential = quVar.d) != null) {
                        return rb.a(identityCredential);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (presentationSession = quVar.e) != null) {
                        return rc.a(presentationSession);
                    }
                    if (Build.VERSION.SDK_INT >= 35) {
                        long j = quVar.f;
                        if (j != 0) {
                            return rd.b(j);
                        }
                        return null;
                    }
                    return null;
                }
                return ra.l(signature);
            }
            return ra.m(cipher);
        }
        return null;
    }

    public static qu d() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder a = qz.a("androidxBiometric", 3);
            qz.d(a);
            qz.e(a);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            qz.c(keyGenerator, qz.b(a));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new qu(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static /* synthetic */ void e(arg argVar, aqm aqmVar) {
        aqt aqtVar = (aqt) argVar;
        if (aqtVar.b == null) {
            aqtVar.b = new RectF();
        }
        RectF rectF = aqtVar.b;
        rectF.getClass();
        rectF.set(aqmVar.a, aqmVar.b, aqmVar.c, aqmVar.d);
        if (aqtVar.c == null) {
            aqtVar.c = new float[8];
        }
        float[] fArr = aqtVar.c;
        fArr.getClass();
        fArr[0] = aqi.a(aqmVar.e);
        fArr[1] = aqi.b(aqmVar.e);
        fArr[2] = aqi.a(aqmVar.f);
        fArr[3] = aqi.b(aqmVar.f);
        fArr[4] = aqi.a(aqmVar.g);
        fArr[5] = aqi.b(aqmVar.g);
        fArr[6] = aqi.a(aqmVar.h);
        fArr[7] = aqi.b(aqmVar.h);
        Path path = aqtVar.a;
        RectF rectF2 = aqtVar.b;
        rectF2.getClass();
        float[] fArr2 = aqtVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static final void f(String str) {
        throw new IllegalArgumentException(str);
    }
}
