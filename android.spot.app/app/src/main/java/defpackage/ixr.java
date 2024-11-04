package defpackage;

import android.text.Editable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixr extends irz {
    final /* synthetic */ ixt a;

    public ixr(ixt ixtVar) {
        this.a = ixtVar;
    }

    @Override // defpackage.irz, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.irz, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
