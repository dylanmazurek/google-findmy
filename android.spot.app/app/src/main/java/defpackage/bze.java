package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bze extends InputConnectionWrapper {
    final /* synthetic */ njz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bze(InputConnection inputConnection, njz njzVar) {
        super(inputConnection, false);
        this.a = njzVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        bym bymVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            bymVar = new bym(new bzg(inputContentInfo), (byte[]) null);
        }
        if (this.a.s(bymVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
