package defpackage;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qu {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final IdentityCredential d;
    public final PresentationSession e;
    public final long f;

    public qu(long j) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = j;
    }

    public qu(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = identityCredential;
        this.e = null;
        this.f = 0L;
    }

    public qu(PresentationSession presentationSession) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = presentationSession;
        this.f = 0L;
    }

    public qu(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }

    public qu(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }

    public qu(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }
}
