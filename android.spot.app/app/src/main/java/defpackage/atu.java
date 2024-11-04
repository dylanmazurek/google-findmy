package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atu extends aow implements axw {
    public moh a;

    public atu(moh mohVar) {
        this.a = mohVar;
    }

    public final boolean a(KeyEvent keyEvent) {
        moh mohVar = this.a;
        if (mohVar != null) {
            return ((Boolean) mohVar.a(new att(keyEvent))).booleanValue();
        }
        return false;
    }
}
