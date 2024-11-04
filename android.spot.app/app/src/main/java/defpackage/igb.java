package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class igb implements jyj {
    final /* synthetic */ kyf a;
    final /* synthetic */ igd b;
    final /* synthetic */ igh c;

    public igb(igh ighVar, kyf kyfVar, igd igdVar) {
        this.a = kyfVar;
        this.b = igdVar;
        this.c = ighVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        this.c.b(this.b);
    }

    @Override // defpackage.jyj
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(jck jckVar) {
        try {
            ihy ihyVar = ((ibu) jckVar.c()).a;
            this.c.a(this.a, new ah(ihyVar, 20));
            ((ibu) jckVar.c()).b.d().c(new iga(this, this.a, ihyVar, this.b, jckVar, 0), this.c.b);
        } catch (CancellationException | ExecutionException unused) {
            this.c.b(this.b);
        }
    }
}
