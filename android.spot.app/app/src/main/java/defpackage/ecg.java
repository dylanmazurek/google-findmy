package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ecg implements TextWatcher {
    final /* synthetic */ Button a;
    final /* synthetic */ ech b;

    public ecg(ech echVar, Button button) {
        this.a = button;
        this.b = echVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ech echVar = this.b;
        if (echVar.af != null) {
            this.a.setEnabled(echVar.aI(editable.toString()));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
