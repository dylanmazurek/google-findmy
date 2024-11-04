package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyl extends fyh {
    private final fip a;
    private final fyi b;
    private final fwo c;

    public fyl(fyi fyiVar, fip fipVar, fwo fwoVar) {
        this.b = fyiVar;
        this.a = fipVar;
        this.c = fwoVar;
    }

    @Override // defpackage.fyh
    public final void c(Status status) {
        if (!status.a()) {
            this.a.k(status);
        } else {
            this.a.k(Status.b);
        }
    }

    @Override // defpackage.fyh
    public final void d(Status status) {
        if (!status.a()) {
            this.a.k(status);
            return;
        }
        fwo fwoVar = this.c;
        if (fwoVar == null) {
            this.a.k(Status.b);
        } else {
            this.b.e(fwoVar, this);
        }
    }
}
