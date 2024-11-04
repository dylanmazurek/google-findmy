package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfg extends dfy {
    public Intent a;

    public dfg() {
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.a != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public dfg(Intent intent) {
        this.a = intent;
    }

    public dfg(hww hwwVar) {
        super(hwwVar);
    }

    public dfg(byte[] bArr) {
        super((byte[]) null);
    }

    public dfg(Exception exc) {
        super(exc, null);
    }
}
