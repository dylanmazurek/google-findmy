package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezd implements TextWatcher {
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() != 0) {
            editable.charAt(0);
            int i = 0;
            while (i < editable.length()) {
                if (!Character.isDigit(editable.charAt(i))) {
                    if (i == 0 && editable.charAt(0) == '+') {
                        i = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        while (i2 < editable.length()) {
                            if (!Character.isDigit(editable.charAt(i2))) {
                                if (i2 == 0) {
                                    if (editable.charAt(0) == '+') {
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                    }
                                }
                                i2++;
                            }
                            sb.append(editable.charAt(i2));
                            i2++;
                        }
                        editable.replace(0, editable.length(), sb);
                        return;
                    }
                }
                i++;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
