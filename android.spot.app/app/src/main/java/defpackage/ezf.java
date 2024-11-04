package defpackage;

import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.TimeUnit;
import android.icu.util.ULocale;
import android.os.Build;
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import j$.time.Duration;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezf extends CountDownTimer {
    public final long a;
    public ProgressBar b;
    public TextView c;
    public boolean d;
    public ecw e;
    private final long f;

    public ezf(long j, long j2) {
        super(j2, 1000L);
        this.f = j;
        this.a = j2;
        this.d = false;
    }

    private final void b(int i) {
        if (this.b != null) {
            if (Build.VERSION.SDK_INT < 24) {
                this.b.setProgress(i);
            } else {
                this.b.setProgress(i, true);
            }
        }
    }

    public final CharSequence a(long j) {
        ULocale uLocale;
        MeasureFormat.FormatWidth formatWidth;
        MeasureFormat measureFormat;
        TimeUnit timeUnit;
        TimeUnit timeUnit2;
        String formatMeasures;
        Duration ofMillis = Duration.ofMillis((this.a - j) + this.f);
        long minutes = ofMillis.toMinutes();
        long seconds = ofMillis.minusMinutes(minutes).toSeconds();
        if (Build.VERSION.SDK_INT >= 24) {
            uLocale = ULocale.getDefault();
            formatWidth = MeasureFormat.FormatWidth.NUMERIC;
            measureFormat = MeasureFormat.getInstance(uLocale, formatWidth);
            Long valueOf = Long.valueOf(minutes);
            timeUnit = MeasureUnit.MINUTE;
            Measure measure = new Measure(valueOf, timeUnit);
            Long valueOf2 = Long.valueOf(seconds);
            timeUnit2 = MeasureUnit.SECOND;
            formatMeasures = measureFormat.formatMeasures(measure, new Measure(valueOf2, timeUnit2));
            return formatMeasures;
        }
        return String.format(Locale.getDefault(), "%2d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.d = true;
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(a(0L));
        }
        ProgressBar progressBar = this.b;
        if (progressBar != null) {
            b(progressBar.getMax());
        }
        ecw ecwVar = this.e;
        if (ecwVar != null) {
            ecwVar.e(R.string.stop_ring_result_success);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(a(j));
        }
        ProgressBar progressBar = this.b;
        if (progressBar != null) {
            long j2 = this.a;
            long j3 = this.f;
            int max = progressBar.getMax();
            b(max - ((int) ((((float) j) / ((float) (j2 + j3))) * max)));
        }
    }
}
