package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ljy extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public ljy(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = true;
    }

    public ljy(String str) {
        super(str);
    }
}
