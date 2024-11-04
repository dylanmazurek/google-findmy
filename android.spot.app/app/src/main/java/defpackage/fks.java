package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fks extends fkt {
    final /* synthetic */ Intent a;
    final /* synthetic */ fjk b;

    public fks(Intent intent, fjk fjkVar) {
        this.a = intent;
        this.b = fjkVar;
    }

    @Override // defpackage.fkt
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
