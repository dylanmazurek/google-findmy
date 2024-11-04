package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfz extends mpe implements mnw {
    final /* synthetic */ mnw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfz(mnw mnwVar) {
        super(0);
        this.a = mnwVar;
    }

    @Override // defpackage.mnw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a() {
        try {
            return (List) this.a.a();
        } catch (SSLPeerUnverifiedException unused) {
            return mlx.a;
        }
    }
}
