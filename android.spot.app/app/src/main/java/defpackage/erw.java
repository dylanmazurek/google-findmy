package defpackage;

import android.icu.number.FormattedNumber;
import android.icu.number.LocalizedNumberFormatter;
import android.icu.util.MeasureUnit;
import androidx.compose.foundation.layout.OffsetElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class erw extends mpe implements mom {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ wi c;
    final /* synthetic */ MeasureUnit d;
    final /* synthetic */ LocalizedNumberFormatter e;
    final /* synthetic */ agt f;
    final /* synthetic */ agt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erw(float f, float f2, wi wiVar, MeasureUnit measureUnit, LocalizedNumberFormatter localizedNumberFormatter, agt agtVar, agt agtVar2) {
        super(3);
        this.a = f;
        this.b = f2;
        this.c = wiVar;
        this.d = measureUnit;
        this.e = localizedNumberFormatter;
        this.f = agtVar;
        this.g = agtVar2;
    }

    @Override // defpackage.mom
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float floatValue;
        float floatValue2;
        MeasureUnit measureUnit;
        double doubleValue;
        FormattedNumber format;
        String formattedNumber;
        abi abiVar = (abi) obj2;
        ((Number) obj3).intValue();
        ((tv) obj).getClass();
        floatValue = ((Number) this.f.a()).floatValue();
        float f = this.b;
        floatValue2 = ((Number) this.g.a()).floatValue();
        double radians = Math.toRadians(floatValue);
        long k = a.k((f / 4.0f) * floatValue2 * ((float) Math.sin(radians)), (-floatValue2) * (this.a / 4.0f) * ((float) Math.cos(radians)));
        aox d = rc.d(new OffsetElement(aqk.b(k), aqk.c(k)), "RangeText");
        Double d2 = (Double) ((equ) this.c.e()).b.f();
        MeasureUnit measureUnit2 = this.d;
        measureUnit2.getClass();
        LocalizedNumberFormatter localizedNumberFormatter = this.e;
        localizedNumberFormatter.getClass();
        if (d2 != null) {
            measureUnit = MeasureUnit.METER;
            if (amr.i(measureUnit2, measureUnit)) {
                doubleValue = d2.doubleValue();
            } else {
                doubleValue = d2.doubleValue() * 3.28084d;
            }
            format = localizedNumberFormatter.format(doubleValue);
            formattedNumber = format.toString();
            formattedNumber.getClass();
        } else {
            formattedNumber = "";
        }
        aah.b(formattedNumber, d, dd.h(abiVar).c, 0L, 0L, null, 0L, 0, false, 0, 0, ((aaj) abiVar.f(aak.a)).a, abiVar, 0, 0, 65528);
        return mlh.a;
    }
}
