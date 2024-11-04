package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqr extends eqe {
    public static eqr aG(eqq eqqVar, String str, int i) {
        eqr eqrVar = new eqr();
        Bundle bundle = new Bundle();
        bundle.putString("inputType", eqqVar.name());
        bundle.putString("currentText", str);
        bundle.putInt("maxChars", i);
        eqrVar.ak(bundle);
        return eqrVar;
    }

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        View inflate = LayoutInflater.from(y()).inflate(R.layout.contact_info_input_dialog, (ViewGroup) null);
        final eqq eqqVar = (eqq) Enum.valueOf(eqq.class, A().getString("inputType", ""));
        final String string = A().getString("currentText", "");
        int i = A().getInt("maxChars", 0);
        final TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(R.id.input_text);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.input_layout);
        textInputEditText.setText(string);
        if (i > 0) {
            textInputLayout.h(true);
            textInputLayout.i(i);
            textInputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
        iqd iqdVar = new iqd(y(), R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog);
        iqdVar.t(inflate);
        iqdVar.r(R.string.save, new DialogInterface.OnClickListener() { // from class: eqp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Editable text = textInputEditText.getText();
                if (text != null) {
                    if (!text.toString().equals(string)) {
                        eqq eqqVar2 = eqqVar;
                        eqr eqrVar = eqr.this;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("fragmentResultKey", text.toString());
                        eqrVar.H().P(eqqVar2.c, bundle2);
                    }
                }
            }
        });
        iqdVar.p(android.R.string.cancel, null);
        int ordinal = eqqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                iqdVar.s(R.string.contact_info_dialog_update_owner_message_title);
                textInputEditText.setMaxLines(6);
                textInputEditText.setHorizontallyScrolling(false);
                textInputEditText.setInputType(1);
                if (string.isEmpty()) {
                    textInputLayout.n(R.string.contact_info_dialog_update_owner_message_text_field_title);
                } else {
                    textInputLayout.n(R.string.contact_info_dialog_edit_owner_message_text_field_title);
                }
            }
        } else {
            iqdVar.s(R.string.contact_info_dialog_update_phone_number_title);
            textInputEditText.setHorizontallyScrolling(true);
            textInputEditText.setInputType(3);
            if (string.isEmpty()) {
                textInputLayout.n(R.string.contact_info_dialog_update_phone_number_text_field_title);
            } else {
                textInputLayout.n(R.string.contact_info_dialog_edit_phone_number_text_field_title);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                textInputEditText.setAutofillHints(new String[]{"phone"});
            }
        }
        return iqdVar.b();
    }
}
