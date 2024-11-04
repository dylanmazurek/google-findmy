package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmu extends ThreadLocal {
    final /* synthetic */ kmv a;

    public kmu(kmv kmvVar) {
        this.a = kmvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) kmn.b.a(this.a.a);
            mac.init(this.a.b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
